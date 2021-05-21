Münster Logic-Imperative Language
=================================
**Additional remark for using Z3 with Free Arrays:** At the moment, Z3 must still be downloaded and included manually. Releases for Z3 can be retrieved [here](https://github.com/Z3Prover/z3/releases).

**Constraint-logic object-oriented programming:** Combine the flexibility of OO/imperative languages with the expressiveness
of constraint-logic programming! Muli builds upon Java and extends it with
features adapted from constraint-logic programming. Muli offers free variables, constraints, encapsulated search,
and a JVM-based runtime environment that executes your Muli programs.


# What is this?

Muli (the **Mü**nster **L**ogic-**I**mperative Language) is a research project at the [Chair for Practical Computer Science](https://www.wi.uni-muenster.de/department/pi), ERCIS, University of Münster.
In this project, we investigate the opportunities that result from combining imperative programming with
constraint (logic) programming. To that end, we are developing a programming language that combines and 
integrates the two paradigms, thus facilitating **constraint-logic object-oriented programming**. In this
GitHub project, you can find [a compiler and a runtime environment](#Compiler_and_runtime)
that you need to get started with Muli.

## Recent publications

Our progress and findings have been published in various outlets. See a selection (in reverse chronological order) below.

* Dageförde, J. C., & Teegen, F. (**2019**). *Structured Traversal of Search Trees in Constraint-logic Object-oriented Programming*. In Proceedings of the Declare 2019, Cottbus, Germany. [arXiv:1908.10264 (open access)](https://arxiv.org/abs/1908.10264)
* Dageförde, J. C., & Kuchen, H. (**2019**). *A Compiler and Virtual Machine for Constraint-logic Object-oriented Programming with Muli*. Journal of Computer Languages, 53, 63–78.  [doi:10.1016/j.cola.2019.05.001](https://doi.org/10.1016/j.cola.2019.05.001)
* Dageförde, J. C., & Kuchen, H. (**2019**). *Retrieval of Individual Solutions from Encapsulated Search with a Potentially Infinite Search Space*. In Proceedings of the 34th ACM/SIGAPP Symposium On Applied Computing, Limassol, Cyprus. [doi:10.1145/3297280.3298912](https://doi.org/10.1145/3297280.3298912) 
* Dageförde, J. C. (**2019**). *Reference Type Logic Variables in Constraint-logic Object-oriented Programming*. In Silva, J. (Ed.), Functional and Constraint Logic Programming (pp. 131–144). Lecture Notes in Computer Science: Vol. 11285. Springer. [doi:doi.org/10.1007/978-3-030-16202-3_8](https://doi.org/10.1007/978-3-030-16202-3_8), [arXiv:1808.08185 (open access)](https://arxiv.org/abs/1808.08185)
* Dageförde, J. C., & Kuchen, H. (**2018**). *A Constraint-logic Object-oriented Language*. In Proceedings of the 33rd ACM/SIGAPP Symposium On Applied Computing, Pau, Frankreich, 1185–1194. [doi:10.1145/3167132.3167260](https://doi.org/10.1145/3167132.3167260)
* Dageförde, J. C., & Kuchen, H. (**2018**). *An Operational Semantics for Constraint-logic Imperative Programming*. In Seipel, D., Hanus, M., & Abreu, S. (Eds.), Declarative Programming and Knowledge Management. WFLP 2017, WLP 2017, INAP 2017. (pp. 64–80). Lecture Notes in Computer Science: Vol. 10997. Cham: Springer. [doi:10.1007/978-3-030-00801-7_5](https://doi.org/10.1007/978-3-030-00801-7_5)

# Compiler and runtime
## Requirements

* JDK Version 8 (e.g. OpenJDK 1.8.0)
* Git (e.g. git 2.14.1)

## Set up a development environment

1. Clone the repository and `cd` into it.
2. Install dependencies: `make`.
3. Develop the runtime inside the `muli-env` directory. There, use `./gradlew run` to execute Muli; arguments (e. g., class to execute) can be added via ` -Dexec.args="..."`.
4. Develop the compiler inside `muli-lang`. There, run `./gradlew jar` to package the compiler and run the created jar.

## Alternatively: Create a distribution

1. Clone the repository and `cd` into it.
2. Run `make muli-env.zip`. The created file `muli-env.zip` is a full archive containing the Muli runtime and its dependencies.
3. Deploy that file where you need it by extracting its contents.
4. Use a starter from `muli-env-*/bin/` according to your OS.
5. Run `make muli-lang.jar`. The jar archive contains the Muli compiler, ready for use.

