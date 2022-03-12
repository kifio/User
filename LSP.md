Here is configs for Java and Kotlin. Also link to syntax highlights for Kotlin.

[Language Server Protocol](https://microsoft.github.io/language-server-protocol/)</br>
[Sublime LSP repository](https://github.com/sublimelsp/LSP)

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
