# Hide and Seek Java Project

## Overview
This is a Java-based CLI application for a "Hide and Seek" lab assignment. It's a Gradle-based project that uses Java 21 and includes utility classes for generating collections of Fuzzy objects with different colors.

**Current State:** Project successfully imported and configured for Replit environment. All dependencies installed and build passing.

## Project Structure
- `app/src/main/java/org/example/` - Main application source code
  - `App.java` - Main entry point (currently a template)
  - `Fuzzy.java` - Simple data class for Fuzzy objects with colors
  - `FuzzyListGenerator.java` - Utility for generating lists of rainbow-colored Fuzzies
- `app/src/test/java/org/example/` - Test files
- `app/build.gradle` - Gradle build configuration
- `gradle/` - Gradle wrapper and dependency management

## Technology Stack
- **Language:** Java 21
- **Build Tool:** Gradle 8.10.2
- **Testing:** JUnit Jupiter 5.10.3
- **Dependencies:** Google Guava 33.2.1-jre

## Recent Changes
- **2025-10-27:** Initial import from GitHub
  - Installed Java GraalVM 22.3 toolchain
  - Configured Gradle build system
  - Set up workflow for running the application
  - Project builds and runs successfully

## Development Commands

### Build the Application
```bash
./gradlew build
```

### Run Tests
```bash
./gradlew test
```

### Run the Application
```bash
./gradlew run --quiet --console=plain
```

The `--quiet` and `--console=plain` flags hide verbose Gradle output.

## Workflow Configuration
- **Run App** - Executes the main application using Gradle's run task with clean console output
- Output type: Console (CLI application, no web interface)

## User Preferences
None recorded yet.

## Notes
- This is a template project for a lab assignment
- The main App.java file is intentionally minimal with a placeholder message
- FuzzyListGenerator provides methods for creating both randomized and sorted lists of Fuzzy objects
- Standard input is configured for the Gradle run task to allow user interaction
