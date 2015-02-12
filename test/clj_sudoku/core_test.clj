(ns clj-sudoku.core-test
  (:require [clojure.test :refer :all]
            [clj-sudoku.core :refer :all]))
(is (= 81 (count squares)) )
(is (= 27 (count unitlist)))
(is (= 3  (count (units :C2))))
(is (= 20 (count (peers :C2))))
(is (=    '(:A2 :B2 :D2 :E2 :F2 :G2 :H2 :I2
                :C1 :C3 :C4 :C5 :C6 :C7 :C8 :C9
                :A1 :A3 :B1 :B3)
          (peers :C2)))
