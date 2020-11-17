def call(Closure postHelloScript) {
    node {
        stage("Hello World") {
            steps {
                script {
                    sh """
                        echo Hello
                    """
                }
            }
        }
        postHelloScript()
    }
}

