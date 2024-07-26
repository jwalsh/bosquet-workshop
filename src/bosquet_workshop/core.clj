(ns bosquet-workshop.core
  (:require [bosquet.llm.generator :as bg]))

(bg/generate
  {:role "As a brilliant {{you-are}} answer the following question."
   :question "What is recursion in programming?"
   :question-answer "Question: {{question}} Answer: {% gen var-name=answer %}" 
   :self-eval "{{answer}} Is this an accurate explanation? {% gen var-name=test model=text-curie-001 %}"}
  {:you-are "computer wizard"
   :question "How does recursion work in Clojure?"})

(bg/generate
  {:role "As a master {{you-are}} answer the following question."
   :question "What is the halting problem in computability theory?"
   :question-answer "Question: {{question}} Answer: {% gen var-name=answer %}"
   :self-eval "{{answer}} Is this correct? {% gen var-name=test model=text-curie-001 %}"}
  {:you-are "logician extraordinaire"
   :question "Is it possible to determine if an arbitrary program finishes running?"})

(bg/generate
  {:role "As a distinguished {{you-are}} answer the following question."
   :question "What is reinforcement learning in AI?"
   :question-answer "Question: {{question}} Answer: {% gen var-name=answer %}"
   :self-eval "{{answer}} Is this an accurate summary? {% gen var-name=test model=text-curie-001 %}"}
  {:you-are "AI expert"
   :question "How is reinforcement learning different from supervised learning?"})

(bg/generate
  {:role "As a preeminent {{you-are}} answer the following question."
   :question "What is Hume's fork in philosophy?"
   :question-answer "Question: {{question}} Answer: {% gen var-name=answer %}"
   :self-eval "{{answer}} Is this correct? {% gen var-name=test model=text-curie-001 %}"}
  {:you-are "philosopher sage"
   :question "What did Hume mean when he divided propositions into two categories?"})

(bg/generate
  {:role "As a celebrated {{you-are}} answer the following question."
   :question "What is a pure function in programming?"
   :question-answer "Question: {{question}} Answer: {% gen var-name=answer %}"
   :self-eval "{{answer}} Is this an accurate explanation? {% gen var-name=test model=text-curie-001 %}"}
  {:you-are "coding expert"
   :question "Why are pure functions important in functional programming?"})
