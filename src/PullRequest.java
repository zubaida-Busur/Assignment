public class PullRequest {

    PullRequest(){}

    public static  void whatIsAPullRequest()
    {
        System.out.println("Pull requests let you tell others about changes you've pushed\n" +
                " to a branch in a repository on GitHub. Once a pull request is opened, \n" +
                "you can discuss and review the potential changes with \n" +
                "collaborators and add follow-up commits before your changes are merged into the base branch.\n" +
                "https://docs.github.com/en/github/collaborating-with-issues-and-pull-requests/about-pull-requests" +
                "");
    }


    public  void  anotherInfoPullRequest()
    {
        System.out.println("If you're working in the shared repository model,\n " +
                "we recommend that you use a topic branch for your pull request.\n " +
                "While you can send pull requests from any branch or commit,\n" +
                " with a topic branch you can push follow-up commits if you need to update your proposed changes.\n");
    }
}
