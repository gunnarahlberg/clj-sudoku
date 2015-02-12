(ns clj-sudoku.core)
;;http://norvig.com/sudoku.html

(def rows (clojure.string/split "A,B,C,D,E,F,G,H,I" #","))

(def cols (range 1 10))

(defn cross [A B] (for [a A b B] (keyword (str a b))))

(def squares (cross rows cols))

(defn unitlist [])
(def units {:C2 []} )
(def peers  {:C2 []})
