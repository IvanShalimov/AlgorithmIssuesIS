# Yoda speech mapping
## Idea
- https://lingualeo.com/ru/blog/2017/12/13/poryadok-slov-v-angliyskom/
- https://ru.wikipedia.org/wiki/%D0%99%D0%BE%D0%B4%D0%B0#%D0%A0%D0%B5%D1%87%D1%8C_%D0%B3%D0%B5%D1%80%D0%BE%D1%8F
- https://ru.wikipedia.org/wiki/%D0%A2%D0%B8%D0%BF%D0%BE%D0%BB%D0%BE%D0%B3%D0%B8%D1%8F_%D0%BF%D0%BE%D1%80%D1%8F%D0%B4%D0%BA%D0%B0_%D1%81%D0%BB%D0%BE%D0%B2#%D0%AF%D0%B7%D1%8B%D0%BA%D0%B8_%D1%81_%D0%B1%D0%B0%D0%B7%D0%BE%D0%B2%D1%8B%D0%BC_%D0%BF%D0%BE%D1%80%D1%8F%D0%B4%D0%BA%D0%BE%D0%BC_OSV
- https://pikabu.ru/story/uchimsya_govorit_kak_yoda_716576


## Explain
### How Yoda Builds a Sentence
Yoda often uses an **object-subject-verb (OSV)** or **object-verb-subject (OVS)** sentence structure, which is uncommon in standard English. Here’s how it works:

1. **Object First:** Yoda often starts with the object of the sentence (the thing being acted upon).
2. **Subject Later:** The subject (the one performing the action) comes after the object.
3. **Verb Placement:** The verb (the action) is often placed at the end or in the middle of the sentence.

Examples of Yoda’s Sentence Structure:
- Standard English: "You must learn patience."
  * Yoda’s Version: "Patience you must learn." (Object-Subject-Verb)
- Standard English: "The Force is strong with you."
  * Yoda’s Version: "Strong with you, the Force is." (Object-Subject-Verb)
- Standard English: "We will watch your career with great interest."
  * Yoda’s Version: "Watch your career with great interest, we will." (Object-Subject-Verb)

### Comparison: Yoda’s Sentence Order vs. Standard English
Here’s a side-by-side comparison of Yoda’s sentence structure and standard English:

**Standard English**	        **Yoda’s Version**	            **Structure**
"You will go to the store."	  "To the store, you will go."	  Object-Subject-Verb (OSV)
"I am your father."	          "Your father, I am."	          Object-Subject-Verb (OSV)
"The dark side is powerful."	"Powerful, the dark side is."	  Object-Subject-Verb (OSV)
"We must trust the Force."	  "Trust the Force, we must."	    Object-Subject-Verb (OSV)

### Why Does Yoda Speak This Way?
Yoda’s unusual sentence structure serves a few purposes:
* Mystique and Wisdom: It makes him sound ancient, wise, and otherworldly.
* Emphasis: By placing the object first, Yoda emphasizes what’s most important in the sentence (e.g., "Patience you must learn" highlights patience as the key takeaway).
* Cultural Identity: It reflects his unique background and species, adding depth to his character.

### Key Differences in Grammar
- **Standard English**: Typically follows a **subject-verb-object (SVO)** order.
  * Example: "Luke (subject) uses (verb) the Force (object)."
- **Yoda’s Speech**: Often uses **object-subject-verb (OSV)** or **object-verb-subject (OVS)**.
  * Example: "The Force (object), Luke (subject) uses (verb)."

### How Yoda Builds a Question
- **Inversion of Word Order**: Like his statements, Yoda often places the object or key idea at the beginning of the question.
- **Omission of Auxiliary Verbs**: Yoda sometimes drops words like "do," "does," or "is" that are commonly used in standard English questions.
- **Tone and Context**: Yoda’s questions often sound more like wise musings or philosophical inquiries rather than direct questions.

### Examples of Yoda’s Questions
Here’s how Yoda might ask questions compared to standard English:

**Standard English**            **Question	Yoda’s Version**	  **Structure**
"Do you understand the Force?"	"Understand the Force, do you?"	Object-Verb-Subject (OVS)
"Is the dark side stronger?"	  "Stronger, the dark side is?"	  Object-Subject-Verb (OSV)
"Can you feel the power?"	      "Feel the power, can you?"	    Object-Verb-Subject (OVS)
"Will you join me?"	            "Join me, will you?"	          Object-Verb-Subject (OVS)

### Key Features of Yoda’s Questions
- **Object First**: The focus of the question (the object) often comes first.
  * Example: "The Force, understand you do?"
  * (Object: "The Force," Verb: "understand," Subject: "you do")

- **Verb-Subject Inversion**: The verb and subject are often inverted or placed at the end.
  * Example: "Ready, are you?"
  * (Object: "Ready," Verb: "are," Subject: "you")

- **Philosophical Tone**: Yoda’s questions often sound like riddles or deep reflections.
  * Example: "Fear, anger, hate, the path to the dark side they are. Agree, do you?"
 
### Comparison: Standard English vs. Yoda’s Questions

**Standard English**	    **Yoda’s Version**	      **Structure**
"Do you see the danger?"	"See the danger, do you?"	Object-Verb-Subject (OVS)
"Is this the way?"	      "The way, this is?"	      Object-Subject-Verb (OSV)
"Can you help me?"	      "Help me, can you?"	      Object-Verb-Subject (OVS)
"Will they survive?"	    "Survive, will they?"	    Object-Verb-Subject (OVS)

### Why Does Yoda Ask Questions This Way?
- **Emphasis**: By placing the object first, Yoda highlights the most important part of the question.
- **Wisdom and Mystery**: His unusual phrasing makes his questions sound profound and thought-provoking.
- **Cultural Identity**: It reinforces his unique way of thinking and speaking, setting him apart from other characters.

## Details
Supporting verbs for version 1
- "am"
- "is"
- "are"
- "ain't"
- "was"
- "were"
- "will"
- "can"
- "may"
- "do"
- "does"
- "did"
- "could"
- "would"

## Version 2
### Key change:
Add work with NLP model from Apache OpenNLP 2.5.3. 
Open models source: https://opennlp.apache.org/models.html
If you want to keep old way to split sentence on  SVO(Subject-Verb-Object) pass "1" in argument "version" else use "2" for argument "version" of function "getYodaString"

### Known Limitation
- In simple sentence I can't handle punctuation marks

### Test Cases
* The cat is eating fish
* You are mighty master jedi
* You will go to the store
* I am your father
* The dark side is powerful
* We must trust the Force
* Do you understand the Force?
* Is the dark side stronger?
* Can you feel the power?

### Comments code
* tokenizer.tokenize(sentence) - The sentence is split into individual tokens (words).
* val parse = ParserTool.parseLine(sentence, parser, 1).first() - The sentence is parsed into a tree structure, where each node represents a phrase (e.g., noun phrase, verb phrase).

## What's next
 -
