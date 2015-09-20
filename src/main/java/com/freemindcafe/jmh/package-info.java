/**
 * \brief Java Microbenchmarking Harness
 *  
 *  <h1>Setup</h1>
 *  <ul>
 *  <li>To run this harness one will have to run it using maven</li>
 *  <li>Please verify that you have maven installed by running <i>mvn -version</i> from command line</li>
 *  <li>Add the new sample to com.freemindcafe.jmh.sample<n> package</li>
 *  <li>Let's assume that the project location on your machine is /path/to/samples-jmh</li>
 *  <li>Run '<i>mvn clean install</i>' command from /path/to/samples-jmh</li>
 *  <li>This will generate the benchmark code under /path/to/samples-jmh/target/generated-sources</li>
 *  <li>Jmh uses APT (annotation processing tool) to generate source by reading the annotations</li>
 *  <li>Run the specific benchmark that you want to verify by running the command below</li>
 *  <li><i>java -jar target/benchmarks.jar <your benchmark class name regular expression> -wi 5 -f 1 -i 5</i></li>
 *  </ul>
 *  <p>
 *  To know all the harness options please refer to http://java-performance.info/jmh/
 *  </p>
 *  
 *  <h1>Terminology</h1>
 *  <ul>
 *  <li>Benchmark annotations (@Benchmark) are processed independently unless we group two benchmarks by creating a group.</li>
 *  <li>warmup iterations (-wi 5) are run that number of times per benchmark annotation.</li>
 *  <li>warmup iteration time (-w 5) is the time for which per warmup iteration will be run.</li>
 *  <li>iterations (-i 5) are number of times a benchmark will be run.</li>
 *  <li>iteration time (-r 5) is the duration in seconds for which a single iteration will be run.</li>
 *  <li> Number of threads (-t 5) are the threads in which the benchmark code will be executed concurrently.</li>
 *  <li>Fork option (-f 2) forks a new jvm. And every warmup iteration and measurement iteration is run independently in those vms.</li>
 *  </ul>
 *  
 *  
 */
package com.freemindcafe.jmh;