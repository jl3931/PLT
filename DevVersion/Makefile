JAVAC=javac
JFLAGS = -g
sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: grammar $(classes)

%.class : %.java
	$(JAVAC) $(JFLAGS) $<

grammar: Grammar.g
	java -jar /usr/local/lib/antlr-4.0-complete.jar Grammar.g

clean :
	rm -f *.class *~