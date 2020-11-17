def call(Closure postHelloStages) {
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
            postHelloStages()
        }
    }
}

