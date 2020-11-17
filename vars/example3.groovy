def call(Closure postHelloScript) {
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
                }
            }
            postHelloScript()
        }
    }
}

