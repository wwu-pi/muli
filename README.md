Münster Logic-Imperative Language
=================================

Combine the flexibility of OO/imperative languages with the expressiveness
of constraint-logic programming! Muli builds upon Java and extends it with
features adapted from constraint-logic programming.

# Requirements

* JDK Version 8 (e.g. OpenJDK 1.8.0)
* Git (e.g. git 2.14.1)

# Set up a development environment

1. Clone the repository and `cd` into it.
2. Install dependencies: `make`.
3. Develop the runtime inside the `muli-env` directory. There, use `./gradlew run` to execute Muli; arguments (e. g., class to execute) can be added via ` -Dexec.args="..."`.
4. Develop the compiler inside `muli-lang`. There, run `./gradlew jar` to package the compiler and run the created jar.

# Create a distribution

1. Clone the repository and `cd` into it.
2. Run `make muli-env.zip`. The created file `muli-env.zip` is a full archive containing the Muli runtime and its dependencies.
3. Deploy that file where you need it by extracting its contents.
4. Use a starter from `muli-env-*/bin/` according to your OS.
5. Run `make muli-lang.jar`. The jar archive contains the Muli compiler, ready for use.

# Context

Muli is a research project at the [Chair for Practical Computer Science](https://www.wi.uni-muenster.de/department/pi), ERCIS, University of Münster.
