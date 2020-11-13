package ise

def c = ise.Helloworld()

c.call()

pipeline {
    agent {
        node {
            label ''
        }
    }
    stages {
        stage('hello') {
            steps {
                script {
                    sh """
                        git clone https://github.com/MacHu-GWU/jenkins_shared_library_test.git
                        cd jenkins_shared_library_test
                        
                    """
                }
            }
        }
    }
}