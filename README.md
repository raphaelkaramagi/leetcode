# leetcode

Auto-synced LeetCode submissions for [raphaelkaramagi](https://github.com/raphaelkaramagi).

Each accepted solve appears as `####-problem-slug/` with:

- `README.md` — problem statement from LeetCode
- `solution.{py,java,...}` — your accepted code

Commits are backdated to when you solved each problem on LeetCode. New solves sync daily via GitHub Actions.

## How sync works

A scheduled workflow (`.github/workflows/sync_leetcode.yml`) uses [joshcai/leetcode-sync](https://github.com/joshcai/leetcode-sync) to pull accepted submissions from your LeetCode account and push them here with historical commit dates.

## One-time GitHub setup

### 1. Enable Actions write permissions

1. Repo → **Settings** → **Actions** → **General**
2. Under **Workflow permissions**, select **Read and write permissions**
3. Save

### 2. Add LeetCode secrets

Log in at [leetcode.com](https://leetcode.com), then open DevTools → **Application** → **Cookies** → `leetcode.com` and copy:

| Cookie | GitHub secret name |
|--------|-------------------|
| `csrftoken` | `LEETCODE_CSRF_TOKEN` |
| `LEETCODE_SESSION` | `LEETCODE_SESSION` |

Add both under **Settings** → **Secrets and variables** → **Actions** → **New repository secret**.

These expire when you log out or after long inactivity. Refresh and update both secrets if the workflow auth step fails.

### 3. Run the first sync

1. **Actions** → **Sync Leetcode** → **Run workflow**
2. Confirm **Verify LeetCode auth** passes
3. Wait for **Sync** to finish — all historical accepted solves are imported on the first run

If the job fails with `API rate limit exceeded` (common with 300+ solves), wait about an hour and re-run. The action resumes from where it stopped.

## Ongoing updates

The workflow runs daily at 08:00 UTC and can be triggered manually anytime. Only new accepted submissions since the last sync are added.

## Commit author

Synced commits use the author name and email from this repo's git history (the initial infrastructure commit). To change them, amend the first commit's author before running sync, or ensure your local git identity matches your GitHub profile before pushing.
