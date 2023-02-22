# Infinitest module base directory bug 

Infinitest has an issue where the base directory is not resolved correctly for Intellij project modules.
It resolves to the root project directory, hence all relative file paths are wrong and the tests fail.

## To reproduce

1. See that `mvn test` works fine (on any level)
2. Open the project in IntelliJ
3. Run the AppTest in the IntelliJ test runner
4. Observe that Infinites fails and turns red
