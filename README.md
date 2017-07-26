# HelloGreetingsJUnit

cd /home/cobalt/NetBeansProjects/SimpleTest; JAVA_HOME=/usr/lib/jvm/java-8-oracle /home/cobalt/netbeans-8.2/java/maven/bin/mvn -Dtest=ph.edu.dlsu.simpletest.GreetingsTest surefire:test
Running NetBeans Compile On Save execution. Phase execution is skipped and output directories of dependency projects (with Compile on Save turned on) will be used instead of their jar artifacts.
Scanning for projects...
                                                                        
------------------------------------------------------------------------
Building SimpleTest 1.0-SNAPSHOT
------------------------------------------------------------------------

--- maven-surefire-plugin:2.10:test (default-cli) @ SimpleTest ---
Surefire report directory: /home/cobalt/NetBeansProjects/SimpleTest/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running ph.edu.dlsu.simpletest.GreetingsTest
getMorningGreet
setMorningGreet
getNightGreet
setAfternoonGreet
setNightGreet
getAfternoonGreet
Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.252 sec

Results :

Tests run: 6, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time: 2.389s
Finished at: Wed Jul 26 19:12:31 PHT 2017
Final Memory: 6M/60M
------------------------------------------------------------------------
