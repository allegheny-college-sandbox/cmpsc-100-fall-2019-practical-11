# CMPSC 100-03 Practical Session 11

* Assigned: Friday, 7 November, 2019
* Due: Monday, 11 November, 2019
* Point value: 20 points

G. Wiz moonlights as a puzzle maker for a local newspaper. This practical will deepen your experience with:
* `for` loops
* `2D arrays`
* Basic algorithms (here, minimums and maximums via something called "Linear Search")
    * We will talk more about what precisely linear search _is_ next week; for now, think back to the last lab's `getWinner` method
* Problem-solving

## General guidelines for this particular practical session

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our lab TLs, or your neighbor.

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

## Slack

Before beginning the practical session, log into our shared [Slack](https://cmpsc100Fall2019.slack.com) workspace and navigate to the `#practicals` channel. Remain in this channel for the duration of the session to accept the assignment and ask and answer questions.

## GitHub

An individualized version of this assignment is available on our GitHub Classroom platform. The link for accepting your individual repository is in the `#practicals` channel of our [Slack](#slack).

## G. Wiz: Puzzle Master

Thanks to the books that G. Wiz bought from his game show winnings, he's developed quite a taste for puzzle-making. Given that he showed his mathematical puzzle prowess on national television (though the means by which he won may have been somewhat dubious), the local newspaper reached out to G. Wiz to become a weekly puzzle master. Of course, he turns to you for help.

Each week, readers have to find the smallest and largest number in a 10 x 10 grid, reporting each number's location in the grid (by row and column) via mail. A random winner will be selected from the correct answers received, but the newspaper has folks working on computational methods to do the winner selection, so all we care about is making sure G. Wiz can generate as many puzzles as he needs in order to fill his weekly quota and has the answer keys to match.

## Required deliverables

### `Grid.java`

- [ ] Exists
- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Creates an instance variable with `private` visibility called `used` to track `int` values used in the construction of the puzzle
- [ ] Implements a complete constructor method which:
* Traverses the grid row by row, column by column using the `seed` method to populate a given space with a random number
- [ ] Implements a `seed` method that generates a random number from 1-1000 (inclusive) using a `do...while` loop; this method should:
* Check if a number has already been used using a completed `checkUsed` method
    * This method should have `private` visibility
    * This method should return a `boolean`
* Add the number to the `used` `ArrayList` after the `do...while` loop completes if the number is unique to _this_ puzzle
- [ ] Implements the correct return type for the `getGrid` method

### `SolveGrid.java`

- [ ] Exists
- [ ] Contains no `TODO` markers
- [ ] Contains no `{Your Name Here}` markers
- [ ] Correctly implements a `main` method as entry point to run the program
- [ ] Uses the `getGrid` method of `Grid` to load the generated grid into an array of the correct data type
- [ ] Prints the generated grid to the screen
- [ ] Implements enough `for` loops to find:
* The smallest number (minimum) and its location in the grid
* The largest number (maxium) and its location in the grid
* This will require at least 1 (but more likely 2) loops
- [ ] Prints the minimum and maxiumum (along with their coordinate values) to the screen

#### Sample output

```
        C1      C2      C3      C4      C5      C6      C7      C8      C9      C10

R1      166     188     200     533     846     108     657     282     183     714
R2      776     972     851     215     582     436     574     572     837     306
R3      201     998     60      642     611     348     521     61      258     49
R4      750     779     823     634     914     808     117     175     286     431
R5      547     659     765     487     856     318     350     383     455     709
R6      190     467     546     781     926     852     542     875     526     453
R7      359     170     520     849     866     317     813     720     922     132
R8      844     828     122     464     434     845     715     205     206     168
R9      893     355     130     560     503     756     941     274     76      411
R10     181     328     699     30      361     109     996     365     426     544

Minimum value 30 found at R10 C4
Maximum value 998 found at R3 C2

```

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it:

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `grade` your team's work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] To grade your team's work, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`
