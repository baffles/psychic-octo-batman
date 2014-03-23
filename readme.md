# psychic-octo-batman

(random GitHub generated name)

`psychic-octo-batman` is a word guesser for the "Draw My Thing" game on mineplex. Yes, it probably is considered cheating.

It has a word list of words I built up while playing the game. Run the program with the number of letters in each word, and optionally a list of letters, and it will print out possible solutions from `words.txt`. This can be done with the `run` command in SBT.

For example:

`run 7 3` -> "pumpkin pie, fishing rod"
`run 7 3 p` -> "pumpkin pie"
`run 7 3 ir` -> "fishing rod"

It's pretty simple and crappy code, this is just something I hacked together while playing the game. And no, I didn't write it to help me win, by the time I started hacking on this I was consistently able to win games, primarily by knowledge of words used in the past. I just wanted something to help me remember more of the less frequent words.

I doubt that anyone playing the game who isn't already smart enough to do something similar will stumble upon this, so I have no qualms about releasing it here. The game is full of trolls anyhow, so it's nice to be able to guess their words pretty quickly based on length and the clues that pop up when they're just drawing unrelated crap.