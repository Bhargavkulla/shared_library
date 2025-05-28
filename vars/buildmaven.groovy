def call(){
    stage('Build Maven'){
        sh 'mvn clean package'
    }
}
