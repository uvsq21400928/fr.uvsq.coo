#
# Java Makefile
#

JC = javac
JCFLAGS = -g

JDOC = javadoc
JDOCFLAGS = -author

.SUFFIXES: .java .class
.java.class:
#	$(JC) $(JCFLAGS) $*.java
	$(JC) $*.java

JAVASRC = $(shell ls *.java)
CLASSES = $(JAVASRC:.java=.class)

all: classes

default: classes

classes: $(CLASSES:.java=.class)

doc: 
	mkdir -p doc
	$(JDOC) $(JDOCFLAGS) -d doc *.java

clean: 
	rm -f *.class
	rm -fr doc
