package ise

def c = ise.Helloworld()

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
                        if [ -e jenkins_shared_library_test ] ; then
                            rm jenkins_shared_library_test
                        fi
                        git clone https://github.com/MacHu-GWU/jenkins_shared_library_test.git
                        cd jenkins_shared_library_test
                        
                    """
                }
            }
        }
    }
}

c.call()