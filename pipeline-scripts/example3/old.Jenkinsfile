pipeline {
    agent {
        node {
            label ""
        }
    }
    stages {
        stage("Hello World") {
            steps {
                //--- begin reusable block---
                script {
                    sh """
                        echo Hello
                    """
                }
                //--- end reusable block---
                script {
                    sh """
                        echo end
                    """
                }
            }
        }
    }
}
