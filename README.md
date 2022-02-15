my SublimeText configuration for using it instead of IDE.

Must have:
1) [Package control](https://packagecontrol.io/)
2) [Language servers & Syntax highlighting](https://github.com/kifio/code-editors-notes/blob/master/LSP.md)
3) Indentation
    - [XML/JSON](https://github.com/kifio/sublimetext_indentxml)
5) Existed plugins and tools.
    - [Terminus](https://packagecontrol.io/packages/Terminus)
    - [GitGutter](https://github.com/jisaacks/GitGutter)
6) Key bindings:
    - ```{ "keys": ["super+d"], "command": "duplicate_line" },```
    - ```{ "keys": ["super+shift+up"], "command": "swap_line_up" },```
    - ```{ "keys": ["super+shift+down"], "command": "swap_line_down" },```
    - ```{ "keys": ["super+shift+j"], "command": "reveal_in_side_bar" },```
    - ```{ "keys": ["super+shift+v"], "command": "toggle_side_bar" },```
6) Android support. This is a huge and still not investigated topic for me. 
    - Logcat. It looks simple. Just write Pidcat (need link) output into the terminal.
    - A way to interact with Android SDK like with Java/Kotlin standard libraries. Support for features like Compose is questionable.
    - Build configurations. Looks easy, Sublime has had good possibilities for it.
    - SVG to Vector drawable (hopes it's possible).
7) UI plugins.
    - Search for classes/files like in IDEA.
    - Text search like in IDEA.

Definitely needed later:
    - Text search like in IDEA.
    - UI plugin for Android SDK manager.
    - UI plugin for AVD manager.
    - Support for iOS SDK.
