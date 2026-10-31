# Security remediation: 31 October 2026

Updated REST Assured/TestNG, patched Jackson BOM and compatible Kotlin dependency management; removed conflicting legacy Groovy dependencies.

Validation: mvn clean test-compile -DskipTests: 4 Java sources compiled; resolved Maven OSV audit passed.

Known advisory check: 42 exact/resolved dependency coordinates; 0 npm lock audit(s); 0 npm findings; 0 unaddressed OSV coordinates. Verified local backport coordinates retained explicitly: 0. This is a dated advisory result, not a security certification.

External API and ReportPortal tests were not run.

The commit hook is enabled per checkout only. Pull-request and scheduled CI repeat the checks. Required GitHub branch checks must be configured after their job names register; adding this workflow alone does not enforce branch protection. Review security updates before merging; no automatic merge or deployment is enabled by this change.
