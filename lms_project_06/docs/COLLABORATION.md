# LMS Project - Team Git Plan

- One branch per task, named feature/<what-it-does> or fix/<what-it-fixes>.
  Nobody works straight on main.
- Everything reaches main through a pull request, and at least one other
  teammate must read the diff and approve it before it is merged.
- Commit messages start with a verb and say what changed, for example
  "Add totalMembers() to LibraryService". Keep one idea per commit.
- Run git pull on main before starting a new branch, and merge main into
  the branch again before opening the PR to keep conflicts small.
- Conflicts are fixed on our own machines: keep the intent of both sides,
  compile, run Main, and only then commit the merge.
- Delete a branch (local and remote) once its PR is merged, and keep
  target/ and IDE files out of the repo through .gitignore.
- Review every pull request within one working day.