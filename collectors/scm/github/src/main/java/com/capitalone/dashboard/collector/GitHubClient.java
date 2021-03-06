package com.capitalone.dashboard.collector;

import com.capitalone.dashboard.misc.HygieiaException;
import com.capitalone.dashboard.model.Commit;
import com.capitalone.dashboard.model.CommitDiffForTag;
import com.capitalone.dashboard.model.GitHubRepo;
import com.capitalone.dashboard.model.GitRequest;
import com.capitalone.dashboard.model.Tag;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;

/**
 * Client for fetching commit history from GitHub
 */
public interface GitHubClient {


	List<Commit> getCommits(GitHubRepo repo, boolean firstRun) throws MalformedURLException, HygieiaException;

    List<GitRequest> getPulls(GitHubRepo repo, String status, boolean firstRun, Map<Long, String> prMap) throws MalformedURLException, HygieiaException;

    List<GitRequest> getIssues(GitHubRepo repo, boolean firstRun) throws MalformedURLException, HygieiaException;

    List<Tag> getTags(GitHubRepo repo) throws MalformedURLException, HygieiaException;
    
    List<CommitDiffForTag> getCommitDiffsForTags(GitHubRepo repo, String startTag, String endTag) throws MalformedURLException, HygieiaException;
}
