pipeline {
    agent {
        node {
            label ""
        }
    }
    stages {
        stage("say hello") {
            steps {
                script {
                    sh """
                        echo "Hello World!"
                    """
                }
            }
        }
        stage("build") {
            steps {
                script {
                    sh """
                        echo "do build"
                    """
                }
            }
        }
        stage("test") {
            steps {
                script {
                    sh """
                        echo "do test"
                    """
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    sh """
                        echo "do deploy"
                    """
                }
            }
        }
        stage("post deploy") {
            steps {
                script {
                    sh """
                        echo "post deploy"
                    """
                }
            }
        }
    }
}
