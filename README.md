This is my notes about my tries to replace a set of IDE's with a Text Editor.

As a mobile developer, I use Android Studio and XCode on daily basis. They are extremely convenient and addictive. 
Android Studio, as IDEA based IDE, has great UX. This IDE includes a lot of features, like languages support, support of different build systems, layout preview, logcat, emulators, profiler, debugger, apk viewer, etc.
Xcode included support of a lot of Apple 'Kits', like UIKit, MLKit, SpriteKit, SourceKit, etc. So, this IDE make work with Apple proprietary solutions possible.

But, last few years I start to think about migration from great IDE's to something simple and lightweight. There are some of my points, why I regularly think about it:

    - IDE's are too heavy. It doesn't matter which modern IDE you use. All of them use a lot of CPU resources and gigabytes of RAM and consume a lot of energy. As a result, the CPU starts throttle, your laptop is loose mobility, because you always need to be near the power source air start heats, coolers start to generate a lot of loud. 

    - A huge part of my work is coding, and mostly I need only a good text editor, terminal, debugger, and maybe a preview of the screen which I working on. But IDE's contains a lot of features. And a lot of these features are unused for me most of the time.

    - Finally, IDE's are too smart (lol, not XCode). It's very easy to start relying on very useful sugar, like autocomplete and stop understanding how things work.

It would be impossible, to relinquish IDE's benefits in favor of something lightweight. Modern software applications are multimodule projects, with thousands of lines of code. They are based on large SDK's which are changing rapidly. Programming languages and specific SDK's also developing very fast. Each new release of Java or Kotlin or Android SDK contains a lot of new features. Some of the new frameworks, languages features, and tools are coupled with IDE's too tightly. But that's no reason to give up.

Fortunately, some IDE's are modular. Features, provided by these IDE's are separated applications. And IDE's contains a lot of bundled plugins as UI clients for these apps. For example, languages support is provided by LSP servers. Things like AVD, or Android SDK manager a few years ago have had different UI apps which started as separate processes. Interfaces for these features are available, and they are can be used separately from IDE via a set of commands with different arguments.

I understand, that totally refuse from IDE's for mobile development is stupid, at least because it's too difficult to replace great interfaces for things like layout management, debugging and profiling provided by IDE's. But as a user of a small subset of IDE's features, I want to try to migrate to text editor and make 95% of my work without launching these monsters.

Next text editors, I see as alternatives to IDE's:

    - Vim. It's free. It's bundled into most UNIX-based OSs. It has a reach set of plugins. I tried it a few times, learned basic commands like navigation, search, replace, different vim modes. I understand that Vim is extremely powerful, but it's too difficult and I'm not ready to learn how to work without mouse pointer in idiomatic vim-way. So, no.
    - Emacs. It's an extremely popular editor. But emacs is also too keyboard-oriented for me, and it uses elisp as plugins language. I'm not ready to even try this editor.
    - VSCode. I tried to use it a few times, but it's overloaded with information. A lot of links, buttons, banners, suggestions. 'You can send statistics', 'You can install bundle of plugins for this lang', 'You can watch our tutorials videos', 'You can go through or interactive tutorial'. Also, this app is written with Electron framework, and it still would be use gigabytes of ram just because it's can.
    - Atom. Free, clear, and simple. I have good experience with programming in different languages in this editor. But it's also based on Electron and it is slow. Also, after the VSCode release this editor was almost dead. I would try it again, but maybe later.
    - Sublime Text. Shareware, simple, extendable, with reach plugins library, extremely fast and lightweight. Python as plugin development language. This editor also was killed with the VSCode release. But this editor has too many benefits. That's why this is my choice for now.
    - Notepad++. Nice, fast, but Windows only.
    - Fleet. It is not released yet but looks very promising. I would not assume anything about this editor ahead of time.

But out of the box, Sublime Text is just a text editor, so for transforming it into a useful tool I need to do some things:

Fundamentals:
1) Configure plugin management. It's simple. There are a lot of information about Package control on the internet. Let's not dwell on it.
2) Configure languages support. I planned to use a few programming languages for work, so I need syntax highlights, autocomplete, goto definition, etc. (Here will be placed a link to my notes about it. But now it's just a list.)
    - java auto imports
    - javatar (need to think about benefits and extending of this plugin)
    - java LSP and java syntax highlight
    - kotlin lsp and kotlin syntax highlight
3) Existed plugins and tools. List here will be grown. 
    - HotKeys.
        - Duplicating line.
        - Multiple cursors.
        - GoTo file in the project tree. 
    - Terminal. Terminus (need link).
    - Indents. 
        - Code indents.
        - non-code indents I already forked the JSON indents plugin (need link) for extending it.
4) Android support. This is a huge and still not investigated topic for me. 
    - Logcat. It looks simple. Just write Pidcat (need link) output into the terminal.
    - A way to interact with Android SDK like with Java/Kotlin standard libraries. Support for features like Compose is questionable.
    - Build configurations. Looks easy, Sublime has had good possibilities for it.
    - SVG to Vector drawable (hopes it's possible).
5) UI plugins.
    - Search for classes/files like in IDEA.

Definitely needed later:
    - Text search like in IDEA.
    - UI plugin for Android SDK manager.
    - UI plugin for AVD manager.
    - Support for iOS SDK.
