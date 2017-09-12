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
2. Clone the submodules: `git submodule update --init`.
3. Install dependencies: `make`.
4. Develop inside the `muli-env` directory.
5. There, use `./gradlew run` to execute Muli.

# Create a distribution

1. Clone the repository and `cd` into it.
2. Run `make muli-env.zip`. The created file `muli-env.zip` is a full archive containing the Muli runtime and its dependencies.
3. Deploy that file where you need it by extracting its contents.
5. Use a starter from `muli-env-*/bin/` according to your OS.

# Context

Muli is a research project at the Chair for Practical Computer Science, ERCIS, University of Münster.
