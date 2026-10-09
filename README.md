Software Construction & Development Labs (Lab 1 - Lab 6)

This repository covers all lab tasks and practical deliverables for SEC321L: Software Construction Lab (Java), showcasing the progression from Lab 1 to Lab 6. The primary objective is to iteratively build a real-world Library Management System (LMS) project in Java and implement core software construction principles.

Lab Sessions Overview

Lab 01: Introduction to Software Construction & Overview of Tools

* Topics Covered: Basics of software construction, JDK installation, Apache Maven setup, code editors (IntelliJ IDEA / VS Code), dependency management, and Checkstyle linter usage.
* Key Tasks: Created HelloWorld.java, used the Jansi package for colored console output, and fixed linter violations.

Lab 02: Coding Standards and Practices (Naming Conventions & Commenting)

* Topics Covered: Java naming conventions (camelCase, PascalCase, UPPER_SNAKE_CASE) and Javadoc documentation.
* Key Tasks: Refactored poorly named classes (calc -> AreaCalculator), added Javadoc and inline comments, and passed Checkstyle checks with 0 violations.

Lab 03: Modular Programming

* Topics Covered: Modular programming, Single Responsibility Principle, High Cohesion, and Low Coupling.
* Key Tasks: Organized the LMS into separate packages (model, service, util), implementing classes such as Book, LibraryService, and LibraryUtils.

Lab 04: Error Handling and Debugging

* Topics Covered: Exception hierarchy, checked vs. unchecked exceptions, try/catch/finally, custom exceptions, and IDE debugging/logging.
* Key Tasks: Created a custom checked exception (BookUnavailableException), used the debugger to trace and fix the findMax() logic bug, and recorded logs to app.log using java.util.logging.Logger.

Lab 05: Version Control in Team Environment (Part I - Git Fundamentals)

* Topics Covered: Git initialization, staging, committing, branching, .gitignore configuration, and remote repository connection.
* Key Tasks: Initialized the local Maven project as a Git repository, created and merged the feature/add-member-lookup branch, and pushed to GitHub.

Lab 06: Version Control in Team Environment (Part II - Remote Collaboration)

* Topics Covered: Merge conflict resolution, Pull Request workflow, Git workflow models (Git Flow vs. GitHub Flow vs. Trunk-Based), and team collaboration planning.
* Key Tasks: Manually resolved a merge conflict (issueBook() documentation), opened and merged a PR on GitHub, and added docs/COLLABORATION.md.

Tech Stack & Tools

* Language: Java (JDK 17+)
* Build Tool: Apache Maven
* Version Control: Git & GitHub
* Editors/IDEs: VS Code / IntelliJ IDEA
* Code Quality: Maven Checkstyle Plugin

Running the Projects
Each lab folder contains a Maven project. Use the following commands in the terminal to run any lab:

mvn clean compile

mvn exec:java -Dexec.mainClass="com.hitms.lms.Main"

Author: Waniza Khan 
