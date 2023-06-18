def call(credentialsId) {
    waitForQaulityGate abortPipeline: false, credentialsId: credentialsId
}