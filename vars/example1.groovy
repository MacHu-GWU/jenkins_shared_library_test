def call() {
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
