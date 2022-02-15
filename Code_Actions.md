**Java & Kotlin Code Actions**

Mandatory code actions for me:
 - Go to definition & Find usages for fields, variables, functios, classes, interfaces, enums.
 - Rename fields, variables, functios, enums, classes (with files in java).
 - AutoComplete for variables types on declaration, variables and classes usages, functions calls.
 - Do not forget to support `static` for Java and `companion` for kotlin.
 - Support for Java, Kolin, JDK, Android SDK.
</br>
Next iterations:
 - Hide suggestions for `private` classes, methods, fields.
 - Suggest overriding for abstract methods from parents/interfaces.
 - Generate equals, hashcode, toString, constructors, getters, setters, data classes, records classes. 
 - Autocomplete for single method classes/interfaces bodies placeholders (like listeners, functional operators).
</br>

**The algorithm**</br>
The obvious idea of the algorithm is generating an index for classes/functions/variables definitions and usage.</br>
For these purposes, I do not need a full set of languages grammars, I just need to implement a definition, declaration, and usage parser.</br>
When the user opens or edits a file, existed index for this file is removed and rebuilt.</br>
Then, the plugin analyzes imports and looks for existing indexes of imported packages.</br>
Indexes for JDK, SDK, libraries are project agnostic and stored on plugin data level.</br>
Indexes for the current project should be kept hidden on the project level.</br>

**Grammars**</br>
Full Kotlin grammar can be found [here](https://kotlinlang.org/docs/reference/grammar.html)</br>
Not significant parts like visibility modifiers, generic constraints, assigns, etc are ommited 
For the start, I need next subset:

MEMBER_DEFINITION: (val | var) Name : Type
CLASS_ARGS_LIST: (MEMBER_DEFINITION)*
CLASS DEFINITION: (abstract) object | class | interface  name LPAREN(CLASS_ARGS_LIST)RPAREN : (INHERITANCE_LIST) {} 

FUNCTION_DEFINITION: fun name LPAREN FUNCTION_ARGS_LIST RPAREN 
FUNCTION_ARGS_LIST: (Name : Type (= default_value))*
COMPANION_MEMBERS_DEFINITION: companion object { (MEMBER_DEFINITION | FUNCTION_DEFINITION)* }

Java (grammar)[https://docs.oracle.com/javase/specs/jls/se7/html/jls-18.html]: 

CLASS DEFINITION: (class | interface | abstract class) name (extends | implements INHERITANCE_LIST) {} 
MEMBER_DEFINITION: Type Name
FUNCTION_DEFINITION: Type name LPAREN FUNCTION_ARGS_LIST RPAREN 
FUNCTION_ARGS_LIST: (MEMBER_DEFINITION*)

**Test Data**
Can be found in `samples` dir.