deps:
	brew install clojure
	brew install leiningen
	brew install swagger-codegen
	brew install openapi-generator

run:
	lein run

lint:
	lein eastwood

update-submodule:
	git submodule update --remote --merge

codegen: codegen-clojure codegen-ruby codegen-python

codegen-clojure: update-submodule
	openapi-generator generate \
	  --skip-validate-spec \
	  -i openai-openapi/openapi.yaml \
	  -g clojure \
	  -o openai-api-clj

codegen-ruby:
	swagger-codegen generate \
	  -i openai-openapi/openapi.yaml \
	  -l ruby \
	  -o openai_api_rb \
	  --model-package openai.model \
	  --api-package openai.api

codegen-python:
	swagger-codegen generate \
	  -i openai-openapi/openapi.yaml \
	  -l python \
	  -o openai_api_py \
	  --model-package openai.model \
	  --api-package openai.api

test:
	lein test

.PHONY: deps run lint update-submodule test
