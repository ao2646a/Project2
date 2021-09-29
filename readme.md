# Project 2
In this project, you will write code which will use OOP to create a Chess Player and emulate the Elo Rating System amongst different instances.

# Teams
You may partner with another student on this project to discuss code and strategies for completing the various parts of the assignment. You may share code with your partner, but you should still write much of your own code in your own repository. You should still update your repository (by pushing) incrementally as you make progress. It is up to teammates to ensure that their partner adheres to the <a href="https://www.american.edu/academics/integrity/code.cfm">American University Honor Code.</a> You may use [pair programming](https://en.wikipedia.org/wiki/Pair_programming), however, you must each take turns in the driver role on your own laptop. I should see commits and a submission on Github for each of you to get full credit for this assignment. If you decide to work with a partner, modify the statement below:

- [X] I worked with Amanda on this project.
- [ ] I worked on my own.

## Step 0 - Background Research.
1. **Both members** should review the description for the <a href="https://en.wikipedia.org/wiki/Elo_rating_system">Elo rating system</a> on Wikipedia.
1. There are a number of videos explaining the rating system. I recommend [this one](https://www.youtube.com/watch?v=AsYfbmp0To0).

## Step 1 - Create the Repo for your Team.
1. **Both members** will clone the repository to your local machines (i.e., using `git clone <URL>`). You will then each have a local repository that is linked to the shared repository, and can work on the code together.
1. As a reference for how to use git, I suggest <a href='http://codingdomain.com/git/'>this site</a>, as it avoids some of the more complicated theory behind git and focuses on the bare minimum practicalities.

## Step 2 - Finish your `ChessPlayer` class.
In the repository is a starter class, `ChessPlayer`. Please complete the code appropriately. `ChessPlayer` class should have the following attributes
1. name
1. yearsExperience
1. eloRating

## Step 3 - Getters and Setters
Create getters and setters for each attribute

## Step 3.5 - Commit and Push to Github
Remember, this is not like using Blackboard for submitting assignments. As you are working with your teammate, you will need to frequently push code to the Github repo. If you wait to the last minute, you could have conflicts that are difficult to resolve. It is much better to get into a rhythm with your partner early. To get full credit for your part in this, I need to see multiple commits from each team member.

## Step 4 - Create the `prob()` method for your ChessPlayer.
This method will calculate the probability of the current instance (i.e the instance calling it) winning the chess game using their `eloRating`. Here is an example:
Suppose there is a live match on chess.com between two players
rating1 = 1200, rating2 = 1000

P1 = (1.0 / (1.0 + pow(10, ((1000-1200) / 400)))) = 0.76
P2 = (1.0 / (1.0 + pow(10, ((1200-1000) / 400)))) = 0.24

## Step 5 - `play()` method
This method would determine the winner of the chess match randomly.


## Step 6 - `elo()` method
This method will use the **getters and setters**, of both the instance calling it and the opponent-instance, for updating the eloRating of both instances.

1. First, the probability of each player winning will be calculated with the `prob()` method.
1. Then, the outcome of the chess match will be determined using the `play()` method.
1. Finally, the `eloRating` of each player will be updated.  

Continuing from example in Step 4:
Suppose Player 1 wins:
rating1 = rating1 + k*(actual – expected) = 1200+30(1 – 0.76) = 1207.2
rating2 = rating2 + k*(actual – expected) = 1000+30(0 – 0.24) = 992.8

`K` is a constant. If `K` is of a lower value, then the rating is changed by a small fraction and vice versa.

## Step 7 - `ChessMatch` class
This is the class where you will emulate a chess match by creating instances of your ChessPlayer class and having them play against each other. 

## Step 8 - Cleanly Print the Results
Each method should output informative messages of what's going on in the backend (e.g `eloRating` before & after a match)

## Step 9 - Push to Github
Do not forget to push your final submission to Github before the deadline.

# Grading
Grading will be assigned according to the following categories. As described in the syllabus, each category can receive a  &#10003; (satisfactory); a &#10003;+ (above and beyond); a &#10003;- (incorrect, incomplete, or sloppy); or in the worst case an &#10005;, meaning it was incorrect in several ways. A category assigned an &#10005; can carry significant grade penalties for this assignment, but usually does not receive more than 50% of the possible credit for an task.

Missing components receive a score of zero, but it is better to be missing a component (or comment it out) instead of submitting code that does not compile. Code that does not compile will not be graded, and a zero will be assigned for the project. Submitted code that contains runtime errors will be graded at the instructor's discretion.

1. **10%** Multiple commits were made throughout the project as progress was made, not just one big upload at the end.
1. **10%** The code is easy to follow and understand. Good comments, meaningful variable names, and good indentation are all present.
1. **15%** The `prob()` method calculates the probability of the instance/object calling it to win a chess match.
1. **15%** The `play()` method is used to decide a winner RANDOMLY.
1. **5%** The `play()` method outputs the expected result of the chess match based on the `yearsExperience` of each player before outputting the winner.
1. **20%** The `elo()` method updates the eloRating for both instances of the ChessPlayer class after determining the probabilities of each player winning using the `prob()` method and determining the winner using the `play()` method.
1. **5%** Getters and setters are created and used for the attributes of the classes.
1. **15%** The `ChessMatch` class is used to emulate a Chess match between two instances of the `ChessPlayer` class.
1. **5%** The results are printed cleanly at the end.

