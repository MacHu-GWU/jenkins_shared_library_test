def call(Closure postscript) {
    steps {
        script {
            sh """
                echo Hello
            """
        }
        postscript()
    }
}

