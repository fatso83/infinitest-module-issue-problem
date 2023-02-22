# Infinitest module base directory bug 

Infinitest has an issue where the base directory is not resolved correctly for Intellij project modules.
It resolves to the root project directory, hence all relative file paths are wrong and the tests fail.

## To reproduce

1. See that `mvn test` works fine (on any level)
2. Open the project in IntelliJ
3. Run the AppTest in the IntelliJ test runner
4. Observe that Infinites fails and turns red

![2023-02-22_16-24](https://user-images.githubusercontent.com/618076/220671090-c7e07671-ff75-4432-839e-1902928343c0.png)
![2023-02-22_16-23 infinitest failure2](https://user-images.githubusercontent.com/618076/220671095-5700653a-9b4a-45cf-980c-1084cd985765.png)
![2023-02-22_16-23 infinitest failure](https://user-images.githubusercontent.com/618076/220671103-14282385-4a1f-460a-9ce7-3e32f6fdd809.png)
