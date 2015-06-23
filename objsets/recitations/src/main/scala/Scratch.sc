import objsets._

val allTweets = TweetReader.allTweets

allTweets.foreach(tweet => println(tweet))