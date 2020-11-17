pipeline {
    agent {
        node {
            label ""
        }
    }
    stages {
        stage("Hello World") {
            steps {
                script {
                    sh """
                        echo Hello
                    """
                }
                script {
                    sh """
                        echo end
                    """
                }
            }
        }
    }
}
