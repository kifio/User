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
      "command": ["/opt/kotlin-language-server/server/build/install/server/bin/kotlin-language-server"], // Update the PATH
      "scopes": [
        "source.Kotlin"
      ],
      "syntaxes": [
        "Packages/User/Kotlin/Kotlin.tmLanguage"
      ],
    }
```

**C/Objective-C/C++/Swift**
[Sourcse-Kit](https://github.com/apple/sourcekit-lsp)
```
"SourceKit-LSP": {
      "command": [
        "xcrun",
        "sourcekit-lsp"
      ],
      "enabled": true,
      "languages": [
        {
          "scopes": ["source.swift"],
          "syntaxes": [
            "Packages/Swift/Syntaxes/Swift.tmLanguage",
            "Packages/Decent Swift Syntax/Swift.sublime-syntax",
          ],
          "languageId": "swift"
        },
        {
          "scopes": ["source.c"],
          "syntaxes": ["Packages/C++/C.sublime-syntax"],
          "languageId": "c"
        },
        {
          "scopes": ["source.c++"],
          "syntaxes": ["Packages/C++/C++.sublime-syntax"],
          "languageId": "cpp"
        },
        {
          "scopes": ["source.objc"],
          "syntaxes": ["Packages/Objective-C/Objective-C.sublime-syntax"],
          "languageId": "objective-c"
        },
        {
          "scopes": ["source.objc++"],
          "syntaxes": ["Packages/Objective-C/Objective-C++.sublime-syntax"],
          "languageId": "objective-cpp"
        },
      ]
    }
```