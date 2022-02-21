## Java & Kotlin Code Actions

### Mandatory code actions for me:
 - Go to definition & Find usages for fields, variables, functios, classes, interfaces, enums.
 - Rename fields, variables, functios, enums, classes (with files in java).
 - AutoComplete for variables types on declaration, variables and classes usages, functions calls.
 - Do not forget to support `static` for Java and `companion` for kotlin.
 - Support for Java, Kolin, JDK, Android SDK.

### Next steps:
 - Handle visibiliity scopes `package` and `private` for classes, methods, fields.
 - Suggest overriding for abstract methods from parents/interfaces. Handle `open` modifier iin Kotlin.
 - Generate equals, hashcode, toString, constructors, getters, setters, data classes, records classes. 
 - Autocomplete for single method classes/interfaces bodies placeholders (like listeners, functional operators).

### The algorithm
The obvious idea of the algorithm is generating an index for classes/functions/variables definitions and usage. For these purposes, I do not need a full set of languages grammars, I just need to implement a definition, declaration, and usage parser. When the user opens or edits a file, existed index for this file is removed and rebuilt. All comments and strings constants removed with regexes (it's much easier, then do it in runtime). Then, the plugin analyzes imports and looks for existing indexes of imported packages. Indexes for JDK, SDK, libraries are project agnostic and stored on plugin data level. Indexes for the current project should be kept hidden on the project level.

### Grammars
[Kotlin grammar](https://kotlinlang.org/docs/reference/grammar.html)</br>
[Java grammar](https://docs.oracle.com/javase/specs/jls/se7/html/jls-18.html)</br>

Not significant parts like visibility modifiers, generic constraints, assigns, etc should be ommited. Any keyword wrapped in reversed apostrophes like \`class\`
should be handled as class/func/variable name.

### Test Data
Can be found in `samples` dir.
