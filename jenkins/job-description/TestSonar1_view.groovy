 
listView('TestSonar1 Jobs') {
    description('TestSonar1 Jobs')
    jobs {
        regex('TestSonar1_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
