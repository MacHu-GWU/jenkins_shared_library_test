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
        example2 {}
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
