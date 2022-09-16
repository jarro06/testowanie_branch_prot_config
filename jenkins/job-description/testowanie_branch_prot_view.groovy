 
listView('testowanie_branch_prot Jobs') {
    description('testowanie_branch_prot Jobs')
    jobs {
        regex('testowanie_branch_prot_.+')
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
