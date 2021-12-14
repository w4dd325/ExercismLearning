class TwoFer {
    static String twoFer(String name) {
       "One for ${name ?: 'you'}, one for me."
        //Uses the "Elvis operator"; this is a shortening of the ternary operator.
        //One instance of where this is handy is for returning a 'sensible default'
        //value if an expression resolves to false-ish (as in Groovy truth). 
    }
}
