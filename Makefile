GIT=git
GRADLE=./gradlew # each project decides its own gradle via gradlew

.PHONY: install-dev
install-dev: install-muggl-for-muli install-muli-classpath install-muli-lang

.PHONY: install-muggl-for-muli
install-muggl-for-muli:
	cd muggl-for-muli && $(GRADLE) install

.PHONY: install-muli-classpath
install-muli-classpath:
	cd muli-classpath && $(GRADLE) install

.PHONY: install-muli-lang
install-muli-lang:
	cd muli-lang && $(GRADLE) jar

.PHONY: dist
muli-env.zip: install-dev
	cd muli-env && $(GRADLE) distZip 
	cp "$(shell ls -t ./muli-env/build/distributions/muli-env-* | head -1)" muli-env.zip

