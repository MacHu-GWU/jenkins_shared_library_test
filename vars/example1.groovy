def call() {
    node {
        stage("say Hello") {
            steps {
                script {
                    sh """
                        echo "Hello World!"
                    """
                }
            }
        }
    }
}
