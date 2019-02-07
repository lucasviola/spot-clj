(ns rest.api.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [rest.api.handler :refer :all]))

(deftest test-app
  (testing "main route should respond with Hello World"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "Hello World"))))

  (testing "not-found route should response with status code 404"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
