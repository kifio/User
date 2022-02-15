Kotlin and Java LSP consume to much RAM. It's easier to use IDE. Yeah, I would spent more RAM, but I would have much more features.</br>  
Here is configs for Java, Kotlin LSP and syntax highlight, but I decide to try something else.

[Language Server Protcol](https://microsoft.github.io/language-server-protocol/)
[LSP repo](https://github.com/sublimelsp/LSP)

**JAVA**
[Java LSP](https://github.com/eclipse/eclipse.jdt.ls)
```
"jdtls": {
      "command": [
        "java",
        "--add-modules=ALL-SYSTEM",
        "--add-opens",
        "java.base/java.util=ALL-UNNAMED",
        "--add-opens",
        "java.base/java.lang=ALL-UNNAMED",
        "-Declipse.application=org.eclipse.jdt.ls.core.id1",
        "-Dosgi.bundles.defaultStartLevel=4",
        "-Declipse.product=org.eclipse.jdt.ls.core.product",
        "-Dfile.encoding=UTF-8",
        "-DwatchParentProcess=true",
        "-noverify",
        "-Xmx1G",
        "-XX:+UseG1GC",
        "-XX:+UseStringDeduplication",
        "-jar",
        "/opt/eclipse.jdt.ls/org.eclipse.jdt.ls.product/target/repository/plugins/org.eclipse.equinox.launcher_1.5.200.v20180922-1751.jar",
        "-configuration",
        "/opt/eclipse.jdt.ls/org.eclipse.jdt.ls.product/target/repository/config_mac",
        "-data",
        "/opt/eclipse.jdt.ls/data"
      ],
      "enabled": true,
      "languageId": "java",
      "scopes": [
        "source.java"
      ],
      "syntaxes": [
        "Packages/Java/Java.sublime-syntax"
      ]
    }
```

**Kotlin**
[Kotlin LSP](https://github.com/fwcd/kotlin-language-server)
[Kotlin Syntax Highlights](https://github.com/Kotlin/kotlin-spec)
```
"kotlinls": {
      "enabled": true,
      "languageId": "kotlin",
      "command": ["/opt/kotlin-language-server/server/build/install/server/bin/kotlin-language-server"],
      "scopes": [
        "source.Kotlin"
      ],
      "syntaxes": [
        "Packages/User/Kotlin/Kotlin.tmLanguage"
      ],
    }
```