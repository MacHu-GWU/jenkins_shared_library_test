def call() {
    stage("say Hello") {
        script {
            sh """
                echo "Hello World!"
            """
        }
    }
}
