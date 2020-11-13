def call() {
    String message = "Hello " + firstName + " " + lastname + "!"
    pipeline {
        //This is where we request a build agent from Jenkins.
        agent {
            //Select an agent node with the labels Centos and small.
            node {
                label ''
            }
        }

        stages {
            //In this stage we will build the Docker image using the Dockerfile defined in $dockerFile.
            stage('step 1'){
                steps {
                    script {
                        sh """
                        echo ${message}
                        """                    
                    }
                }
            }
        }
    }
}