# infinitest.filters in modules not being used
> This is a feature request for per-module filters


The documentation talks about placing `infinitest.filters` in 
relationship to modules, but it does not actually say that 
one can use different filters per module.

This should be possible. Right now, only the root folder
will be used, so the filters apply globally.

## To reproduce

1. See that `mvn test` works fine (on any level)
2. Open the project in IntelliJ
3. Run the AppTest in the IntelliJ test runner
4. Observe that Infinitest fails and turns red
5. Move the infinitest.filters file from the `backend` directory up one level and rebuild
6. Observe it working
