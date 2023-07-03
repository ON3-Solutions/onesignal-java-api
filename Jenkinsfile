pipeline {
    agent any
    
    stages {
        stage('Building...') {
            steps {
                sh "MAVEN_SKIP_RC=true JAVA_HOME=/Disk1/jdks/jdk-18.0.2.1 mvn clean -DskipTests install"
            }
        }
    }
    post {
        always {
            discordSend description: "Build: " + env.BUILD_NUMBER + "\nStatus: " + currentBuild.currentResult, link: env.BUILD_URL, result: currentBuild.currentResult, title: JOB_NAME + " #" + env.BUILD_NUMBER, webhookURL: "https://discord.com/api/webhooks/1072227391159668807/xJdxR37ZBo9jThJeF9tiBb_vyIt1UhsovOb0FLk19IrCk3-mp_EIlCdR0bYR91sGkqCP"
        }
    }
}
